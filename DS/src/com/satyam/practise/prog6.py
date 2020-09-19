class User:

    def __init__(self, first_name,last_type,age,gendre):
        self.first_name = first_name
        self.last_type = last_type
        self.age = age
        self.gendre = gendre


    def describe_user(self):
        print("FIRST NAME",self.first_name)
        print("LAST NAME",self.last_type)
        print("AGE", self.age)
        print("GENDRE", self.gendre)


    def greet_user(self):
        print("Hello how are you?")


us = User("SATYAM","SHEEL",21,"MALE")
us.describe_user()
us.greet_user()
