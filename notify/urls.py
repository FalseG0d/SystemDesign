from django.urls import path
from . import views

urlpatterns=[
    path('notify',views.notify,name='notify'),
 #   path('report',views.report,name='report')
]