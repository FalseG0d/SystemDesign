from django.shortcuts import render,redirect
import datetime
from .models import News,NewsType,Other,OtherType,Uncertain
import smtplib
from notify.models import Email

# Create your views here.
def index(request):
        news=News.objects.all()
        newstype=NewsType.objects.all()
        other=Other.objects.all()
        othertype=OtherType.objects.all()
        return render(request,'index.html',{'news':news,'newstype':newstype,'others':other,'othertypes':othertype})

def report(request):
        if request.method=='POST':
                news=Uncertain()
                news.pub_date=datetime.datetime.now()
                news.title=request.POST.get('title')
                news.desc=request.POST.get('desc')
                news.image=request.POST.get('img')
                nt=NewsType()
                nt.sect="Local"
                news.sect = nt
                
                nt.save()
                news.save()
                with smtplib.SMTP('smtp.gmail.com',587) as smtp:
                        smtp.ehlo()
                        smtp.starttls()
                        smtp.ehlo()

                        smtp.login('codingprac10@gmail.com','10111998@Ma')
                        emails=Email.objects.all()
                        for email in emails:
                                name=email.username
                                to=email.email
                                
                                sub=news.title
                                body='Dear '+name+', This is a sample mail send to notify you about \n'+news.desc

                                msg=f'Subject:{sub}\n\n{body}'
                                smtp.sendmail('codingprac10@gmail.com',to,msg)
                                
                        return redirect('/')        
        
        return render(request,'index.html')

                