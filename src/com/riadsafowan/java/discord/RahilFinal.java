package com.riadsafowan.java.discord;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class RahilFinal {

    class QSN1 {
        abstract static class FootBall {
            protected String playerName;
            protected int age;
            protected String tournamentName;
            protected int totalGoal;

            public FootBall(String playerName, int age, String tournamentName, int totalGoal) {
                this.playerName = playerName;
                this.age = age;
                this.tournamentName = tournamentName;
                this.totalGoal = totalGoal;
            }

            abstract void seniorPlayer(Player[] info);

            abstract Player match(Player[] info);
        }

        interface AverageGoal {
            double goal(Player[] info);
        }

        interface AverageAge {
            void age(Player[] info);
        }

        static class Player extends FootBall implements AverageGoal, AverageAge {

            private int totalMatch;

            public Player(String playerName, int age, String tournamentName, int totalGoal, int totalMatch) {
                super(playerName, age, tournamentName, totalGoal);
                this.totalMatch = totalMatch;
            }

            public int getTotalMatch() {
                return totalMatch;
            }

            @Override
            void seniorPlayer(Player[] info) {
                int sAge = info[0].age;
                int index = 0;
                for (int i = 0; i < info.length; i++) {
                    if (sAge < info[i].age) {
                        sAge = info[i].age;
                        index = i;
                    }
                }

                try {
                    FileWriter myWriter = new FileWriter("senior.txt");
                    myWriter.write("Name: " + info[index].playerName + " Age: " + info[index].age + " Tournament Name: " + info[index].tournamentName + " Total goal: " + info[index].totalGoal + " Total match: " + info[index].totalMatch);
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            Player match(Player[] info) {
                int lMatch = info[0].totalMatch;
                int index = 0;
                for (int i = 0; i < info.length; i++) {
                    if (lMatch > info[i].totalMatch) {
                        lMatch = info[i].totalMatch;
                        index = i;
                    }
                }
                return info[index];
            }

            @Override
            public double goal(Player[] info) {
                int totalGoal = 0;
                for (int i = 0; i < info.length; i++) {
                    totalGoal += info[i].totalGoal;
                }

                return totalGoal / (double) info.length;
            }

            @Override
            public void age(Player[] info) {
                int tAge = 0;
                for (int i = 0; i < info.length; i++) {
                    tAge += info[i].age;
                }
                double avgAge = tAge / (double) info.length;
                System.out.println("Average Age: " + avgAge);
            }
        }

        class Test {
            public static void main(String[] args) {
                Player[] players = new Player[5];
                players[0] = new Player("Rahil", 21, "xyz", 7, 3);
                players[1] = new Player("Rahil", 21, "xyz", 7, 3);
                players[2] = new Player("Rahil", 21, "xyz", 7, 3);
                players[3] = new Player("Rahil", 21, "xyz", 7, 3);
                players[4] = new Player("Rahil", 21, "xyz", 7, 3);

                Player p = players[0];

                p.seniorPlayer(players);

                Player lP = p.match(players);

                try {
                    FileWriter myWriter = new FileWriter("low.txt");
                    myWriter.write("Name: " + lP.playerName + " Age: " + lP.age + " Tournament Name: " + lP.tournamentName + " Total goal: " + lP.totalGoal + " Total match: " + lP.getTotalMatch());
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Average Goal: " + p.goal(players));
            }
        }
    }

    class Qsn2 {
        static class Subject {
            public int specificSubject(int[][] marks, String[] subjects, String subject) {
                int total = 0;
                int position = 0;
                for (int i = 0; i < subjects.length; i++) {
                    if (Objects.equals(subjects[i], subject)) {
                        position = i;
                    }
                }
                for (int i = 0; i < subjects.length; i++) {
                    total += marks[i][position];
                }
                return total / subjects.length;
            }
        }

        public static void main(String[] args) {
            int[][] marks = {
                    {14, 54, 36, 12, 32},
                    {58, 58, 55, 45, 11},
                    {4, 77, 55, 44, 21},
                    {44, 77, 55, 44, 21},
                    {52, 45, 88, 44, 11}
            };
            String[] names = {"SAKIB", "MUSHFIQ", "MUSTAFIZ", "TAMIM", "MASH"};
            String[] subjects = {"CSE115", "CSE215", "CSE173", "CSE373", "CSE473"};

            Subject subject = new Subject();

            System.out.println("Avg marks of CSE215 is " + subject.specificSubject(marks, subjects, "CSE215"));
            System.out.println("Avg marks of CSE173 is " + subject.specificSubject(marks, subjects, "CSE173"));
            System.out.println("Avg marks of CSE473 is " + subject.specificSubject(marks, subjects, "CSE473"));
        }
    }
}
