from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS234", Account("Charles Castillo", "75867760"))
    print(vars(car))
    print(vars(car.driver))