from django.shortcuts import render,redirect
from django.http import HttpResponse
import gspread
import smtplib
from oauth2client.service_account import ServiceAccountCredentials
# Create your views here.
def index(request):
    return render(request,"index.html")

def team(request):
    return render(request,"team.html")

def register(request):
        if request.method=='POST':
                scope=['http://spreadsheets.google.com/feeds','https://www.googleapis.com/auth/drive']
                creds=ServiceAccountCredentials.from_json_keyfile_name('googleSheets.json',scope)
                client=gspread.authorize(creds)
                sheet=client.open('TnMData').sheet1                
                name=request.POST['name']
                college=request.POST['college']
                phone=request.POST['phone']
                email=request.POST['email']
                #event=request.POST['event']
                event=str(request.POST.getlist('event'))

                entry=[name,college,phone,email,event]
                sheet.insert_row(entry,index=2)
                with smtplib.SMTP('smtp.gmail.com',587) as smtp:
                        smtp.ehlo()
                        smtp.starttls()
                        smtp.ehlo()

                        smtp.login('techsurgenmridang.mait@gmail.com','Jaishreeram20')
                        
                        username=name
                        to=email
                             
                        sub='Registration Confirmed'

                        body='Dear '+username+', This is to notify you about the confirmation of your registration for '+event

                        msg=f'Subject:{sub}\n\n{body}'
                        smtp.sendmail('techsurgenmridang.mait@gmail.com',to,msg)
                                     
                print(entry)
                return redirect('/')
