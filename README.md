
# Coffee Machine in Java


## About

What can be better than a cup of coffee during a break? A coffee that you don’t have to make yourself.
It’s enough to press a couple of buttons on the machine and get a cup of energy.
In this project, I used Java to build a coffee machine simulator.
The machine works with typical products: coffee, milk, sugar, and plastic cups; that we can fill in the coffee machine. If it runs out of something, it shows a notification.
You can get three types of coffee: espresso, cappuccino, and latte. Since nothing’s for free, it also collects the money! 

Initially, the coffe machine has :

- water - 400 ml 
- coffeeBeans - 120 g 
- milk - 500 ml
- money - 550 $
- cups - 9 

## Ingredients needed in coffee 

### espresso - 

- water - 250 ml 
- coffeeBeans - 16 g 
- income - 4 $

### latte - 

- water - 350 ml 
- coffeeBeans - 20 g 
- milk - 75 ml
- income - 7 $

### cappuccino - 

- water - 200 ml 
- coffeeBeans - 12 g 
- milk - 100 ml
- income - 6 $

## Demo

Here is a simple coffee machine simulation below :

```
Write action (buy, fill, take, remaining, exit):
> buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 3
I have enough resources, making you a coffee!

Write action (buy, fill, take, remaining, exit):
> remaining
The coffee machine has:
200 ml of water
440 ml of milk
108 g of coffee beans
8 disposable cups
$556  of money

Write action (buy, fill, take, remaining, exit):
> buy
What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:
> 1
Sorry, not enough water!

Write action (buy, fill, take, remaining, exit):
> fill
Write how many ml of water you want to add:
> 20
Write how many ml of milk you want to add
> 10
Write how many grams of coffee beans you want to add
> 7
Write how many disposable cups you want to add:
> 3

Write action (buy, fill, take, remaining, exit):
> take
I gave you $556

Write action (buy, fill, take, remaining, exit):
> remaining
The coffee machine has:
220 ml of water
450 ml of milk
115 g of coffee beans
11 disposable cups
$0  of money

```







 






