from django.urls import path
from . import views
urlpatterns=[
    path("",views.index,name="index.html"),
    #path("index.html/#",views.index,name="index.html"),
    path("team.html",views.team,name="team.html"),
    path("submit",views.register,name="register"),
]