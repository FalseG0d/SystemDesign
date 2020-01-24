from django.shortcuts import redirect
import smtplib
from .models import Email
# Create your views here.
def notify(request):
    with smtplib.SMTP('smtp.gmail.com',587) as smtp:
        smtp.ehlo()
        smtp.starttls()
        smtp.ehlo()

        smtp.login('codingprac10@gmail.com','10111998@Ma')
        
        name=request.POST['Name']
        to=request.POST['Email']
        
        sub='Sample Notification'
        body='Dear '+name+', This is a sample mail send to verify your email.'

        msg=f'Subject:{sub}\n\n{body}'
        smtp.sendmail('codingprac10@gmail.com',to,msg)
        
        if not Email.objects.filter(email=to).exists():
            email=Email.objects.create(username=name,email=to)
            email.save()

        return redirect('/')
