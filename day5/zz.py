def get_average(marks):
    avg = 0.0
    sum = 0
    for i in marks.values():
        sum += i
    avg = sum / len(marks)
    return print(f"평균은 {avg}입니다.")
    

marks = {"국어":100 , "영어":100 , "수학":100}
get_average(marks)