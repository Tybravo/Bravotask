def heartrate_calculator(age, target):
    #age = 35

    GIVEN = 220
    heart_rate_beat = GIVEN - age
    current_rate = (target / 100) * heart_rate_beat
    minimum_rate = (50 / 100) * heart_rate_beat
    maximum_rate = (85 / 100) * heart_rate_beat

    if target == 0:
        return "Heart rate at initial"
    if target == 50:
        return minimum_rate
    if target == 85:
        return maximum_rate
    if target < 50:
        return "Heart rate too low"
    if target > 85:
        return "Heart rate too high"
    if target > 50 and target < 85:
        return f"{minimum_rate} and {maximum_rate}"
    if target >= 50 and target <= 85:
        return f"""
        Current Heart rate: {current_rate}
        Minimum Heart rate: {minimum_rate}
        Maximum Heart rate: {maximum_rate}
        Target heart rate range: {minimum_rate} - {maximum_rate}%
        """

print(heartrate_calculator(30, 85))

