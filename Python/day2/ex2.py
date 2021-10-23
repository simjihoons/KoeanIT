# # 튜플
# # 저장된 값을 변경 할 수 없는 배열

# t = (1,2,3,4,5)
# print(t)
# print(type(t))

# print(t[0])

# # #세트
# # # 중복된 값이 들어갈 수 없음
# #세트를 초기화 하는 방법은 my_set = set()
# my_set = {1,2,3,3}
# print(my_set)
# print(type(my_set))

# print("--------------------------")

# java = {"Eric","Woz","Bill"}
# python = {"Rossum","Woz"}

# # #교집합
# print(java & python)
# print(java.intersection(python))

# # #합집합
# print(java | python)
# print(java.union(python))

# # #차집합
# print(java - python)
# print(java.difference(python))


# # print("--------------------------")
# #f-string
# #fomat() 메서드 안에 있는 방식이다.
# #python 3.6 이후에서만 사용가능

# station = "부전"
# time = 6
# print("지금 "+station+"행 "+str(time)+"시 열차가 들어오고 있스빈다")

# print("지금 {}행 {}시 열차가 들어오고있음".format(station,time))

# print(f"지금 {station}행 {time}시 열차가 들어옴")


# #input()
# #입력 받을때 사용

# # name = input("이름을 적어주세요 >>>")
# # print(name)

# station = input("목적지 :")
# time= input("시간 : ")     #input으로 받으면 int가 아닌 string으로 받아짐

# #time  = time +1  #time 은 string이기 때문에 +가 안됨 , 형 변환 해야한다.
#                  #time= int(input("시간 : ")) 하면 해결됨

# print(f"지금 {station}행 {time}시 열차온다")


