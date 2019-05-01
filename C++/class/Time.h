#ifndef DUREE_H
#define DUREE_H
#include <iostream>
#include <iomanip>
#include <string>

typedef unsigned long long ULLong_t;

class Time
{
private:
    //std::string myTime;
    ULLong_t myHours;
    short unsigned myMinutes;
    void normaliser();
public:
    //void normstr();
    //void setmyTime(std::string);
    //std::string getmyTime() const;
    Time(const ULLong_t, const short unsigned);//, const std::string);
    ULLong_t getmyHours() const;
    short unsigned getmyMinutes() const;
    void addmyHours(ULLong_t);
    void addmyMinutes(short unsigned);
    void display();
};

#endif // DUREE_H
