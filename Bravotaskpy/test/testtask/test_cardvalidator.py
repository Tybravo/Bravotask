import unittest
from task.task import cardvalidator


class TestCardValidator(unittest.TestCase):
    def test_that_function_to_add_every_second_digit_right_to_left_exist(self):
        exist = cardvalidator.add_every_second_digit_right_to_left(4388576018402626)
        self.assertTrue(exist,4388576018402626)

    def test_to_add_every_second_digit_right_to_left(self):
        even_num = cardvalidator.add_every_second_digit_right_to_left(4388576018402626)
        self.assertEqual(even_num,37)

    def test_to_add_odd_digits_right_to_left(self):
        odd_num = cardvalidator.every_second_digit_right_to_left_odd_place(4388576018402626)
        self.assertEqual(odd_num,38)

    def test_to_get_first_digit_to_check_card_type(self):
        card_type = cardvalidator.get_card_type(4388576018402626)
        self.assertEqual(card_type,'Visa Card')

    def test_to_get_first_digit_to_check_wrong_card_type(self):
        card_type = cardvalidator.get_card_type(7388576018402626)
        self.assertEqual(card_type,'Invalid Card Type')

    def test_to_get_card_length(self):
        card_length = cardvalidator.count_num_digit(4388576018402626)
        self.assertEqual(card_length,"16")

    def test_to_get_wrong_card_length(self):
        wrong_length = cardvalidator.count_num_digit(738857601)
        self.assertEqual(wrong_length,"Invalid Card Number")

    def test_to_validate_card_status(self):
        card_status = cardvalidator.validate_status(4388576018410707)
        self.assertEqual(card_status,"Valid Card")

    def test_to_validate_wrong_card_status(self):
        wrong_status = cardvalidator.validate_status(738857)
        self.assertEqual(wrong_status,"Card Status Invalid")

