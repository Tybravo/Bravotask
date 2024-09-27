

#
# def ascending_float(number_float):
#
#     number_list = [int(digit) for digit in str(number_float[0])]  # Extract digits from the input
#
#     for i in range(len(number_list)):
#
#         min_index = i
#         for j in range(i + 1, len(number_list)):
#             if number_list[j] < number_list[min_index]:
#                 min_index = j
#
#         number_list[i], number_list[min_index] = number_list[min_index], number_list[i]
#
#     return ''.join(map(str, number_list))
#
# print(ascending_float([6425]))











def ascending_float(number_float):

    number_float = list(str(number_float))

    for index in range(len(number_float)):
        smallest_index = index
        for count in range(index + 1, len(number_float)):
            if number_float[count] < number_float[smallest_index]:
                smallest_index = count

        number_float[index], number_float[smallest_index] = number_float[smallest_index], number_float[index]


    return int(''.join(number_float))

print(ascending_float(6425))

