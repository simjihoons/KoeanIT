station = "서면"
time = 12

#print(station+"행 "+str(time)+"시 열차가 들어오고 있습니다.")
print(station,"행 ",time,"시 열차가 들어오고 있습니다.")

station = "전포"
time = 6
print(station+"행 "+str(time)+"시 열차가 들어오고 있습니다.")






#퀴즈
#subway = ["유재석" , "하하" , "박명수"]
#1.박명수만 출력
#2.박명수의 명만 출력
subway_ex = ["유재석" , "하하" , "박명수"]
print(subway_ex[2])
print(subway_ex[2][1])




#퀴즈
#주차장에 차가 들어간다.
#차량번호가 12가3456이라고 했을때
#차량번호 뒷 네자리만 출력하세요

car_ex = "12가3456"
print(car_ex[3:]+"번호의 차가 입차했습니다.")





#퀴즈
#상품 일련번호가 aaa/bbb/ccc/에서
#aaa : 상품분류
#bbb : 제조사
#ccc : 상품순서 일때
#일련번호 523SAM001 이것을 아래와 같은 방식으로 출력
#"상품분류" : 523 , "제조사" : SAM , "순서":001
print("\n")
print("\n")


goods = "523SAM001"
print("상품분류: "+goods[:3]+" 제조사: "+goods[3:6]+" 순서: "+goods[6:]) # + 사용
print("상품분류:",goods[:3],"제조사:",goods[3:6],"순서:",goods[6:])      # , 사용


#퀴즈
#1234
#1234 2345
#1234 2345 3456
#1234 2345 3456 , 4567
#1234,2345,4567

ParkingLine = [1234]
print(ParkingLine)

# 위에 또는
#ParkingLine = []
#ParkingLine.append(1234)


ParkingLine.append(2345)
print(ParkingLine)

ParkingLine.append(3456)
print(ParkingLine)

ParkingLine.append(4567)
print(ParkingLine)

ParkingLine.remove(3456)
print(ParkingLine)