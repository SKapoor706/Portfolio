def hotel_cost(nights):
    return 140 * nights
    
def plane_ride_cost(city):
    if city ==  "Charlotte":
        return 183
    elif city == "Tampa":
        return 220
    elif city == "Pittsburgh":
        return 222
    elif city == "Los Angeles":
        return 475
 
def rental_car_cost(days):
    rent = 40 * days
    if days >= 7:
        rent -= 50
    elif days > 2:
        rent -= 20
    return rent
    
def trip_cost(city,days,spending_money):
    return hotel_cost(days) + plane_ride_cost(city) + rental_car_cost(days) + spending_money
    
print trip_cost("Los Angeles", 5 , 600)