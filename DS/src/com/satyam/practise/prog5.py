class resturant:

    def __init__(self, rest_name,cusine_type):
        self.rest_name = rest_name
        self.cusine_type = cusine_type

    def printInfo(self):
        print("Resturant Name is",self.rest_name)
        print("Best cusine is",self.cusine_type)

    def open_resturant(self):
        print("The resturant is now open")


res = resturant("ROLL CORNER","CHICKEN EGG ROLLS")
res.printInfo()
res.open_resturant()
