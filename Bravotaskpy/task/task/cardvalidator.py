
def main():
    card_num = int(input("Kindly enter card number to verify: "))

    right_to_left = add_every_second_digit_right_to_left(card_num)
    print(right_to_left)

    odd_num = every_second_digit_right_to_left_odd_place(card_num)
    print(odd_num)

    card_type = get_card_type(card_num)
    print(card_type)

    count = count_num_digit(card_num)
    print(count)

    validate = validate_status(card_num)
    print(validate)

    print("***********************************************")
    print("Credit Card Type:", card_type)
    print("Credit Card Number:", card_num)
    print("Credit Card Digit Length:", count)
    print("Credit Card Validity status:", validate)
    print("***********************************************")


add_up = 0
sum_up = 0
def add_every_second_digit_right_to_left(digit):
        card_num = 4388576018402626

        global add_up
        card_num = str(digit)
        add_up= 0
        add_num_below_10 = 0
        add_num_above_10 = 0

        for index in range(len(card_num) - 2, -1, -2):
            even_num = int(card_num[index]) * 2

            if even_num >= 10:
                for numbers in str(even_num):
                    add_num_above_10 = int(add_num_above_10) + int(numbers)
                print(add_num_above_10)

            if even_num < 10:
                add_num_above_10 = add_num_above_10 + even_num
                print(add_num_above_10)

            add_up = add_num_below_10 + add_num_above_10

        return add_up

#print(add_every_second_digit_right_to_left(4388576018402626))


def every_second_digit_right_to_left_odd_place(number):
        card_num = str(number)

        global sum_up
        sum_up = 0

        for index in range(len(card_num) - 1, 0, -2):
            odd_num = int(card_num[index])
            sum_up = sum_up + odd_num

        return sum_up

#print(every_second_digit_right_to_left_odd_place(4388576018402626))


def get_card_type(card_type):
        card_type_to_str = str(card_type)
        first_digit = card_type_to_str[0]

        if first_digit == '3':
            return "American Express Card"
        elif first_digit == '4':
            return "Visa Card"
        elif first_digit == '5':
            return "Master Card"
        elif first_digit != '3' and first_digit != '4' and first_digit != '5':
            return "Invalid Card Type"
        else:
            return "Invalid Card Type"


def count_num_digit(card_digit):
        get_digit = str(card_digit)
        if len(get_digit) != 16:
            return "Invalid Card Number"
        else:
            return "16"

def validate_status(card_digit):
    card_type_to_str = str(card_digit)
    first_digit = card_type_to_str[0]

    global add_up, sum_up
    get_digit = str(card_digit)
    sum_of_num = add_up + sum_up
    if sum_of_num % 10 != 0 and len(get_digit) != 16:
        return "Card Status Invalid"
    elif first_digit != '3' and first_digit != '4' and first_digit != '5':
        return "Card Status Invalid"
    else:
        return "Valid Card"



if __name__ == "__main__":
    main()