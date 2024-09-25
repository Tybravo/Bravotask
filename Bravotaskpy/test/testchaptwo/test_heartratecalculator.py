import unittest

from task.chaptwo import heartratecalculator

class Test_Heartratecalculator(unittest.TestCase):
    def test_that_heart_rate_calculator_exists(self):
        exists = heartratecalculator.heartrate_calculator(age = 35, target= 1)
        self.assertIsNotNone(exists, True)

    def test_that_heart_rate_calculator_display_minimum_heart_rate_beat(self):
        given = heartratecalculator.heartrate_calculator(age = 35, target = 50)
        self.assertEqual(given,92.5)

    def test_that_heart_rate_calculator_display_maximum_heart_rate_beat(self):
        given = heartratecalculator.heartrate_calculator(age = 30, target = 85)
        self.assertEqual(given,161.5)

    def test_that_heart_rate_calculator_display_at_zero(self):
        given = heartratecalculator.heartrate_calculator(age = 35, target = 0)
        self.assertEqual(given,"Heart rate at initial")

    def test_that_heart_rate_calculator_display_too_high(self):
        given = heartratecalculator.heartrate_calculator(age = 35, target = 86)
        self.assertEqual(given,"Heart rate too high")

    def test_that_heart_rate_calculator_display_too_low(self):
        given = heartratecalculator.heartrate_calculator(age = 35, target = 49)
        self.assertEqual(given,"Heart rate too low")

    def test_that_heart_rate_calculator_display_range(self):
        given = heartratecalculator.heartrate_calculator(age = 35, target = 75)
        self.assertEqual(given, "92.5 and 157.25")
