package ru.geekbrains.java1.lesson7;

    public class Plate {

        private int food;

        public int getFood() {
            return food;
        }

        public void addFood(int amount){
            food += amount;
        }

        public boolean decreaseFood(int amount) {
            if (amount <= food) {
                food -= amount;
                return true;
            }else {
                System.out.println("Not enough food");
                return false;
            }
        }

        public Plate(int food) {
            this.food = food;
        }

        public void info() {
            System.out.println("Food: " + food);
        }
    }
