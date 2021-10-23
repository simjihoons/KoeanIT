#클래스 변수
from typing import Mapping


class 빵():
    기본재료 = "밀가루"


단팥빵 = 빵()
식빵 = 빵()
크로아상 = 빵()

# print(단팥빵.기본재료)

#--------------------------------------------------------------------------------
#%%
#메서드

# def 함수명(매개변수):
#     코드
#     return 리턴값


class 붕어빵():
    #아래는 instance 메서드
    def say(self, value):  #instance 메서드의 첫번째 인자는 반드시 self이다.
        return "너무 맛있어"


단팥붕어빵 = 붕어빵()
슈크림붕어빵 = 붕어빵()
#%%
#print(단팥붕어빵.say(value))


class person():
    def cry(self):
        print("응애응애")


baby = person()
baby.cry()

#%% 위예제 응용


class person():
    def cry(self, value):
        print(value * 2)


baby = person()
human = person()

baby.cry("응애")
human.cry("엉엉")
human.cry("흑흑")
human.cry("깔깔")


#%% 메서드 내에서 다른 메서드 호출
def say():
    return "뭐?"


class 붕어빵():
    def say(self):
        return "맛있어"

    def greeting(self):
        print(self.say())
        print(say())


피자붕어빵 = 붕어빵()
피자붕어빵.greeting()


#%% 메서드 내에서 클래스 변수 호출
class 마카롱():
    category = "과자"

    def information(self):
        print(f"I am a {self.category}")
        #함수 내에서 클래스 변수를 쓸때는  self를 붙여줘야한다.


치즈마카롱 = 마카롱()
치즈마카롱.information()


#%%
class Circle():
    pi = 3.14

    def area(self, radius):
        return self.pi * (radius**2)


pizza = Circle()
table = Circle()

pizzaArea = pizza.area(10)
print(pizzaArea)

tableArea = table.area(50)
print(tableArea)


#%%
#인스턴스 변수 사용
class People():
    country = "Korea"

    def who_am_i(self, name, age, tel):
        self.name = name
        self.age = age
        self.tel = tel


man = People()
woman = People()

man.who_am_i("홍길동", 20, "010-1111-2222")
woman.who_am_i("신사임당", 10, "010-1111-2222")


#%% 인스턴스 변수
# 각 객체가 가진 별도의 변수
# 선언은 되어 있지않아도 됨
class BTS():
    company = "BIGHIT"
    pass


jin = BTS()
rm = BTS()

jin.age = 30
rm.age = 28

print(jin.age)
print(jin.company)
print(rm.age)


#%%
class SmartPhone():
    def setSmartPhone(self, model, brand, owner, telnum):
        self.model = model
        self.brand = brand
        self.owner = owner
        self.telnum = telnum

    def callBy(self, to):
        print(f"{self.telnum}에서 {to}로 전화 거는중.")


iphone = SmartPhone()
Sam = SmartPhone()

iphone.setSmartPhone('X', "apple", "철수", "010-1234-2222")
Sam.setSmartPhone("Zfold3", "samsung", "영희", "010-1111-3333")

iphone.callBy("010-111-3233")
Sam.callBy(iphone.telnum)

#%% 생성자 - constructor
# 클래스를 호출할때, 자동으로 어떤 함수나 실행하거나 값을 호출할때 사용

# 인스턴스를 생성할때 자동으로 호출

#메서드랑 쓰는 방식이 똑같고, 메서드명만 __init__라고 쓴다.


class Shooter():
    def __init__(self):
        print("Hello?")


shoot = Shooter()


#%%
class Circle():
    pi = 3.14

    def __init__(self, radius):
        print(f"넓이 {self.pi*(radius**2)}cm의 원이 생성되었습니다.")


pizza = Circle(20)

#%% 상속 - Inheritance
# 어떤 클래스가 가지고 있는 기능을
# 그대로 물려받아서 사용할때 쓰는 기술

# 상속관계 구현
# Is - a 관계 : ~는 ~다


class 빵:  #부모 클래스를 슈퍼클래스라 함.
    pass


class 붕어빵:  #자식 클래스를 서브클래스라 함.
    pass


#-------------------
class 사람:
    pass


class 학생:
    pass


#------------------------------


#구현
class Country:  #보통 슈퍼클래스는 ()를 안씀 , 하지만 써도된다.
    name = "국가명"
    population = "인구"
    capital = "수도"


class Korea(Country):
    def __init__(self, name) -> None:
        self.name = name
        #super().__init__()

    def showName(self):
        print("국가 이름은 : ", self.name)


a = Korea("대한민국")
a.showName()

print(a.capital)  #상속


#%%
class Person():
    def __init__(self, name, age) -> None:
        self.name = name
        self.age = age

    def eat(self):
        print(f"{self.name}이 밥을 먹습니다.")


class Student(Person):
    def __init__(self, name, age, school, grade) -> None:
        super().__init__(name, age)
        self.school = school
        self.grade = grade

    def study(self):
        print(f"{self.name} 이(가) {self.school}에서 공부를 합니다.")


man = Student("홍길동", 16, "고등학교", 3)

man.eat()
man.study()
