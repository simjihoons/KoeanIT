#%%
# 사람 클래스를 만들어 아래와 같이 출력하게 코딩
# 김철수 010-1234-2345 발신중...


class Person():
    def call(self, name, num):
        print(f"{name} {num} 발신중...")


human = Person()
human.call("김철수", "010-1234-5678")

#%% 구구단 클래스


class MultiplicationTable():
    def line(self, num):
        for i in range(1, 10):
            print(f"{num}*{i}={num*i}")


m = MultiplicationTable()
m.line(5)

#%% Book은 책 제목, 저자,출판사,가격,페이지 수
#로 구성되어있을때 Book class를 작성


class Book():
    def setBook(self, title, author, company, price, page):
        self.title = title
        self.author = author
        self.company = company
        self.price = price
        self.page = page

    def getBook(self):
        print(
            f"제목 :{self.title}\n저자 :{self.author}\n출판사 :{self.company}\n가격 :{self.price}원\n페이지 수 :{self.page}쪽"
        )


book = Book()
book.setBook("모모", "미하엘 엔데", "나무", 8500, 367)
book.getBook()


#%% 자동차
# 모델명,연식,제조사,배기량,연비,연료
class Car():
    def setCar(self, model, year, company, cc, rate, fuel):
        self.model = model
        self.year = year
        self.company = company
        self.cc = cc
        self.rate = rate
        self.fuel = fuel

    def getCar(self):
        print(
            f"모델명 : {self.model}\n연식 : {self.year}\n제조사 : {self.company}\n배기량 : {self.cc}\n연비 : {self.rate}\n연료 : {self.fuel}"
        )


car = Car()
car.setCar("베뉴", 2022, "현대", 1598, 13.7, "가솔린")
car.getCar()

#%% 생성자 이용
#사람이라는 클래스를 생성하고
# 객체를 생성하자 마자 "응애응애"를 출력


class Person():
    def __init__(self):
        print("응애응애")


baby = Person()

#%% 생성자 사용
# human = 사람("이순신")
# 이순신 님이 태어났습니다.


class Person():
    def __init__(self, name) -> None:
        print(f"{name} 님이 태어났습니다.")


human = Person("이순신")
human = Person("홍길동")

#%%
#human = 사람("이순신",1986)
#print(human.연도)
#1986


class Person():
    def __init__(self, name, year) -> None:
        self.name = name
        self.year = year


human = Person("이순신", 1986)
print(human.year)


#%%
#human = 사람("홍길동")
#human.성
#human.이름
#홍
#길동 으로 출력
class Person():
    def __init__(self, name) -> None:
        self.name = name
        self.lastName = name[0]
        self.firstName = name[1:]


human = Person("홍길동")
print(human.lastName)
print(human.firstName)

#%%
#FBPlayer 클래스
#이름 나이 소속팀 국적 포지션


class FBPlayer():
    def __init__(self, name, age, team, nationality, position) -> None:
        self.name = name
        self.age = age
        self.team = team
        self.nationality = nationality
        self.position = position


son = FBPlayer("손흥민", 30, "토트넘", "한국", "FW")

print(son.name)
print(son.age)
print(son.team)
print(son.nationality)
print(son.position)


#%% 인사 관리 데이터
class HumanResource():
    def __init__(self, name, age, department, rank, salary) -> None:
        self.name = name
        self.age = age
        self.department = department
        self.rank = rank
        self.salary = salary


employee1 = HumanResource("홍길동", 20, "인사과", "대리", 4000)

print(employee1.name)
print(employee1.age)
print(employee1.department)
print(employee1.rank)
print(employee1.salary)

#%% 상속 이용
# 자동차 클래스
# 바퀴갯수 , 출고가격 인스턴스변수로 갖는다.
# car = Car(4,2000)


class Car():
    def __init__(self, wheel, price) -> None:
        self.wheel = wheel
        self.price = price


class Bycicle(Car):
    pass