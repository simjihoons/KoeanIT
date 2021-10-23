# 자동차 클래스
# 바퀴갯수 , 출고가격 인스턴스변수로 갖는다.
# car = Car(4,2000)


class Car():
    def __init__(self, wheel, price) -> None:
        self.wheel = wheel
        self.price = price


class Bicycle(Car):
    def __init__(self, wheel, price):
        super().__init__(wheel, price)


bicycle = Bicycle(2, 100)
print(bicycle.wheel)
print(bicycle.price)
