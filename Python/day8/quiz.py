#%%
#파일을 열고 내용을 읽어오는데 파일이 없으면
#파일이 존재하지 않는다는 예외처리를 하는 프로그램 만들어보기
#인쇄물에서 발생할 에어를 찾아서 처리하면 더 좋음
#에러를 발생시켜 보고 어떤 에러인지 확인 후에 처리해도 ok

# file = open('test.txt', 'w', encoding='utf-8')  #encoding 생략가능
# file.write('Hello world~\n')
# file.close()

try:
    filename = input("열고자 하는 파일명 입력 : ")
    file = open(filename, "r", encoding="utf-8")
except FileNotFoundError:
    print("파일이 없습니다.")
else:
    buffer = file.read()
    print(buffer)
    print()
    file.close()
finally:
    print("Program off")

#%%
# 입력 받은 이름이 2-6 사이가 아니면 NameError 발생
# 이름은 2~6사이로 입력해라 라고출력
# 정상적인 상황이면 "입력된 이름은 {} 입니다." 출력


class NameError(Exception):
    def __init__(self) -> None:
        super().__init__("Len Error :  이름은 2-6 사이로 입력")


try:
    name = input("이름 입력 : ")
    if len(name) > 6 or len(name) < 2:
        raise NameError
except Exception as e:
    print(e)
else:
    print(f"입력된 이름은 {name}입니다.")
finally:
    print("Program Off")

# https://tinyurl.com/yjagob8z