
def sep_digits(number):

    separated = ""
    digits = str(number)

    for index in range(len(digits)):
        separated += digits[index]

        if index != len(digits):
            separated += " "
    return f" {separated} "

print(sep_digits(42339))