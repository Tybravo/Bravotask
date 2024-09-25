import unittest
from task.chaptwo import investmentreturn

class TestInvestmentReturn(unittest.TestCase):
    def test_that_investment_return_function_exist(self):
        exists = investmentreturn.investment_rate(7)
        self.assertIsNotNone(exists)

    def test_investment_return_yielded_after_10_years(self):
        years = investmentreturn.investment_return_after_10_years(10)
        self.assertEqual(years,"$1967.15")

    def test_investment_return_yielded_after_20_years(self):
        years = investmentreturn.investment_return_after_20_years(20)
        self.assertEqual(years,"$3869.68")

    def test_investment_return_yielded_after_30_years(self):
        years = investmentreturn.investment_return_after_30_years(30)
