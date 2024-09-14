
numof_student = int(input("Enter number of students: "))
numof_subject = int(input("Enter number of subjects: "))

inside_list = []
reg_student =[]
for index in range(numof_student):
    for subject in range(numof_subject):
        inside_list.append(0)
    reg_student.append(inside_list)
    inside_list = []
print(reg_student)

for outside in range(len(reg_student)):
    print(f"Student {outside+1}: ")
    for inside in range(len(reg_student[outside])):


      reg_student[outside][inside] = int(input(f"Enter score for subject {inside+1}: "))
print(reg_student)

total_score = []
average_score = []
sum = 0
ave = 0
for index in range(len(reg_student)):
    for count in range(len(reg_student[index])):
        sum += reg_student[index][count]
    ave = sum / numof_student

    average_score.append(ave)
    total_score.append(sum)
    sum = 0
   #ave = 0

#print(total_score)
#print(average_score)

print("\nResults:")
print(f"{'Student':<10}{'Subjects':<20}{'Total Score':<15}{'Average Score':<15}{'Position':<10}")

for index in range(numof_student):
    student_subjects = ' '.join(map(str, reg_student[index]))
    print(f"{'Student ' + str(index + 1):<10}{student_subjects:<20}{total_score[index]:<15}{average_score[index]:<15.2f}")

