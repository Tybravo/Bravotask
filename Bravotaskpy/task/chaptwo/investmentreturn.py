def investment_rate(percentage):
    INVESTMENT_PERCENTAGE = 7
    return INVESTMENT_PERCENTAGE
print(investment_rate(7))

ANNUAL_RATE = 7
amount_invested = 1000
percentage_rate = 7/100

def investment_return_after_10_years(ten_years):
    ten_years_return = (1 + percentage_rate) ** ten_years
    money_after_10_years = amount_invested * ten_years_return
    money_after_10_years = round(money_after_10_years, 2)
    return f"${money_after_10_years}"
print(investment_return_after_10_years(10))


def investment_return_after_20_years(twenty_years):
    twenty_years_return = (1 + percentage_rate) ** twenty_years
    money_after_20_years = amount_invested * twenty_years_return
    money_after_20_years = round(money_after_20_years, 2)
    return f"${money_after_20_years}"
print(investment_return_after_20_years(20))

def investment_return_after_30_years(thirty_years):
    thirty_years_return = (1 + percentage_rate) ** thirty_years
    money_after_30_years = amount_invested * thirty_years_return
    money_after_30_years = round(money_after_30_years, 2)
    return f"${money_after_30_years}"

print(investment_return_after_30_years(30))
