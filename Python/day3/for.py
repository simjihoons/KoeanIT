#%% for
#반복할 횟수를 알고있을때 사용
'''
for 변수 in 반복되는객체:
    실행할 문장
'''

list = ["지하1층","1층","2층","3층"]

for i in list:
    print(i)
#%%
list = ["김밥","라면","튀김"]

for menu in list:
    if menu == "김밥":
        print(f"오늘의 메뉴는 {menu}입니다.")

#%%
list = [3,-20,5,0,-10]

for num in list:
    if num >0:
        print(num)



# %%
#리스트에서 20보다 작은 3의 배수르 출력해라

list = [2,3,5,7,11,12,20,25,32,40]


for i in list:
    if (i<20) and (i % 3 ==0):
        print(i)

#%% 대소문자를 구분하는 isupper()를 이용해 리스트에서 대문자만 출력
list = ['A','b','c','D']

for i in list:
    if i.isupper() == True:
        print(i)
# %%
#저장된 문자열의 길이를 다음과 같이 출력하라.
list = ["SK하이닉스" , "삼성전자","LG전자"]

for i in list:
    print(len(i))
    