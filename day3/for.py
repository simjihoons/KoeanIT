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
