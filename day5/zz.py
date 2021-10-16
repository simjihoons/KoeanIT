def get_average(marks):
    avg = 0.0
    sum = 0
    for i in marks.values():
        sum += i
    avg = sum / len(marks)
    return print(f"평균은 {avg}입니다.")
    

marks = {"국어":90 , "영어":80 , "수학":85}
get_average(marks)