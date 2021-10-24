#%% 복습
#class


#클래스 생성
class 빵():
    pass


#객체 생성
단팥빵 = 빵()
소라빵 = 빵()
붕어빵 = 빵()


#%%
#클래스 변수
class 빵():
    분류 = "음식"


단팥빵 = 빵()

print(단팥빵.분류)

#%% 인스턴스 메소드


class 빵():
    분류 = "음식"

    #인스턴스 메서드는 반드시 self를 첫 인자로 가져야한다.
    def bake(self):
        print("갓 구운 빵이 나왔어요!")


단팥빵 = 빵()
소라빵 = 빵()
붕어빵 = 빵()

단팥빵.bake()

#%%

#%% 생성자


class 빵():
    분류 = "음식"

    def __init__(self) -> None:
        print("갓 구운 이 나왔어요!")


단팥빵 = 빵()
소라빵 = 빵()

붕어빵 = 빵()

#%% 인스턴스 변수


class 빵():
    분류 = "음식"

    def __init__(self, name, price) -> None:
        self.name = name
        self.price = price
        print(f"갓 구운 {name}이 나왔어요!")


단팥빵 = 빵("단팥빵", 1000)
소라빵 = 빵("초코소라빵", 1500)
붕어빵 = 빵("슈크림", 2000)


#%% 상속
class 빵():
    분류 = "음식"

    def __init__(self, name, price) -> None:
        self.name = name
        self.price = price
        print(f"갓 구운 {name}이 나왔어요!")


class 붕어빵(빵):
    def __init__(self, name, price, 속재료="단팥") -> None:
        super().__init__(name, price)
        self.속재료 = 속재료


팥붕어 = 붕어빵("팥잉어", 1000)
슈붕어 = 붕어빵("슈잉어", 1000, "슈크림")

print(슈붕어.속재료)
print(팥붕어.속재료)

#==============================================================================================
#%% 예외처리
# 프로그램에서 에러가 발생했을때, 어떻게 핸들링 할지 결정
# 404 페이지는 대표적인 웹 예외상황 핸들링

# 고전적인 예외처리 방식 소개
a = int(input("나눠질값(제수) : "))
b = int(input("나눌값(피제수) : "))

# # 5/3은 실행 되지만 3/0는 에러뜸
# print(f"{a} / {b} = {a/b}")
# 밑의 방법(예상이되는)으로 해결이 가능하긴 하다.

if (b == 0):
    print("0으로는 나눌수 없다.")
else:
    print(f"{a} / {b} = {a/b}")

#예외처리
#모든 예외를 한꺼번에 처리하는 방식
'''
try:
    처리할 코드
except:
    예외상황시 사용되는 코드    
'''
#%% if대신 예외처리를 사용

a = int(input("나눠질값(제수) : "))
b = int(input("나눌값(피제수) : "))

try:
    print(f"{a} / {b} = {a/b}")
except:
    print("error")

#%%
try:
    height = float(input("키 입력 : "))
    height = round(height)
    print(f"입력하신 키는 {height}입니다.")
except:
    print("error")

#%% 문자열을 실수로 변환 해서 출력하려면 에러가 발생한다.
# 예외처리를 통해서 에러가 발생하는 PER은 0으로 출력

PER = ["10.31", "", "8.00"]

for i in PER:
    try:
        print(float(i))
    except:
        print(0)

#%% 특정 예외만 처리하는 방식

try:
    a = int(input("나눠질값(제수) : "))
    b = int(input("나눌값(피제수) : "))

    print("{0} / {1} = {3}".format(a, b, (a / b)))
except ZeroDivisionError:
    print("0으로 나눌수 없습니다.")
except ValueError:
    print("정수만 입력할수 잇습니다.")
except Exception:
    print("알수없는 에러")

#%% 대부분의 예외는 예외 메세지를 갖고있음
# 메세지를 직접 받아서 처리하는 방식

try:
    a = [10, 20, 30, 40, 50]
    a[10]
except Exception as e:
    print(f"예외발생 : {e}")

#%% 예외가 발생 한 우에도 코드를 처리할 수 있는 방법
#else , finally
'''
try:
    코드 작성 영역
except:
    예외 발생시 처리영역
else:
    예외 없을때 처리 영역
finally:
    언제나 실행되는 영역
'''

try:
    a = int(input("나눠질값(제수) : "))
    b = int(input("나눌값(피제수) : "))
    result = a / b
except ZeroDivisionError:
    print("0으로 못나눔")
except ValueError:
    print("정수만 입력")
else:
    print(f"{a} / {b} = {result}")
finally:
    print("Program off")

#%% 강제로 예외발생
# 사용자정의 예외발생
# 점수를 입력 받아서 80-100이면 합격
# 80점 이하면 불합격 출력
# 음수나 100점 초가시 메시지 출력

try:
    score = int(input("점수 입력 : "))
    if score < 0 or score > 100:
        raise Exception("점수는 0~100 사이입니다.")
except Exception as e:
    print(e)
else:
    if score >= 80:
        print("합격")
    else:
        print("불합격")

#%% 사용자 정의 오류
# Exception 클래스를 상속받아서 사용


class MyError(Exception):
    def __init__(self) -> None:
        super().__init__("사용자 정의 에러 발생")


class HourError(Exception):
    def __init__(self) -> None:
        super().__init__("시간은 1시부터 23시까지")


try:
    hour = int(input("시간 입력 : "))
    if hour < 0 or hour > 23:
        raise HourError
except HourError as e:
    print(e)