# # #퀴즈 1
# # # 두개의 숫자를 입력받아
# # # 사직연산, 몫과 나머지를 구하는 프로그램 만드셈

# # num1 = int(input("첫 번째 숫자 : "))
# # num2 = int(input("두 번째 숫자 : "))

# # print(f"{num1} + {num2} = {num1+num2}")
# # print(f"{num1} - {num2} = {num1-num2}")
# # print(f"{num1} * {num2} = {num1*num2}")
# # print(f"{num1} / {num2} = {num1/num2}")
# # print(f"{num1} % {num2} = {num1%num2}")
# # print(f"{num1} // {num2} = {num1//num2}")


# # #퀴즈2
# # # 영어 사전 구현
# # # 딕셔너리 하나 생성하고 영어 단어를 입력하면 뜻을 출력하는 프로그램

# # eng_dict={
# #     "food" : "음식",
# #     "water" : "물",
# #     "key" : "열쇠",
# # }

# # word = input("단어 입력 : ")

# # #print(f"{word}의 뜻은 {eng_dict[word]} 입니다.")
# # print(f"{word}의 뜻은 \"{eng_dict.get(word)}\" 입니다.")

# # # #영어 사전에 단어와 뜻 추가
# # add_word_english = input("추가할 단어를 입력 : ")
# # add_word_korean = input("추가 할 단어의 뜻 입력 : ")

# # eng_dict[add_word_english] = add_word_korean
 
# # print(eng_dict)

# # # 연산자 심화 + 입출력 + 알고리즘 !
# # # 1분은 60초 , 1시간은 60분일 때,
# # # 임의의 초로 입력받아 해당 초를
# # # 시,분,초로 변환하여 출력하는 프로그램 구현

# # sec = int(input("초를 입력 하세요 :"))
# # hour = sec // 3600
# # min = (sec % 3600) // 60
# # s = sec % 60

# # # print(f"{sec}초 는 {hour}시 {min}분 {s}초")

# # #임의의 세 자리 정수(100~999)를 입력받아
# # #백의 자리 ,십의자리,일의 자리
# # #분리하여 출력하는 프로그램

# # num = int(input("숫자 입력 :"))
# # h = num // 100
# # t = (num % 100) // 10
# # o = (num % 100) % 10
 
# # print(f"백의 자리: \"{h}\" 십의 자리: \"{t}\" 일의 자리: \"{o}\"")

# # # 주차장에 60대로 주차대수가 정해져있다
# # # 차량이 들어오는 대수를 입력받으면
# # # 남은 주차대수를 구하는 프로그램을 작성

# # limit = 60
# # space = 60

# # car = int(input("들어오는 차량의 수 입력 : "))


# # #print(f"남아있는 주차 공간은 {limit-car} 입니다")

# # space -= car
# # print(f"남아있는 주차 공간은 {space} 입니다")

# # #퀴즈
# # # 1~12까지의 값을 입력받아 해당 월은 몇일까지 있는지 출력해봅시다
# # days = [31,28,31,30,31,30,31,31,30,31,30,31]

# # month = int(input("몇 월 입력? "))
# # print(f"{month}월의 일수는 {days[month-1]} 입니다.")

# # #세트
# # 수학여행을 어디로 갈지 결정하기 위한 설문 조사를 하려고 합니다.
# # 학생들이 원하는 장소를 입력받아 동일한 입력은 무시하고
# # 모든 입력을 저장하려고 합니다.
# # 학생을 3명으로 가정하고 프로그램 작성

# my_set = set() #세트 초기화

# my_set.add(input("희망하는 여행지를 입력 : "))
# my_set.add(input("희망하는 여행지를 입력 : "))
# my_set.add(input("희망하는 여행지를 입력 : "))

# print(my_set)

#퀴즈
#상품 일련번호가 aaa/bbb/ccc/에서
#aaa : 상품분류
#bbb : 제조사
#ccc : 상품순서 일때
#상품 일련번호를 입력하면 상품 분류,제조사 분류 , 상품 순번을 
#출력하는 프로그램 작성

#(이때 삼품 분류 - aaa 사이에 탭,
# 제조사 - bbb 사이에 탭 ,
# 상품 순번 - ccc사이에 탭으로 표시)

#예

# 상품 일련번호 ; 1231231234
# 상품 분류 : 123
# 제조사 : 123
# 상품 순번 : 1234

product = input("상품 일련 번호 입력 :")
print("\n")
print(f"상품 일련번호:\t{product}\n상품 분류:\t{product[:3]}\n제조사:\t\t{product[3:6]}\n상품 순번:\t{product[6:]}")



