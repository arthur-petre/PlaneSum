#include "class/Time.h"

using namespace std;

Time::Time(const ULLong_t heures, const short unsigned minutes)    //, const string temps)
{
    this->myMinutes = minutes;
    this->myHours = heures;
//  this->myTime = temps;
}

void Time::addmyMinutes(short unsigned mn)
{
    this->myMinutes += mn;
}

void Time::addmyHours(ULLong_t h)
{
    this->myHours += h;
}

ULLong_t Time::getmyHours() const
{
    return this->myHours;
}

short unsigned Time::getmyMinutes() const
{
    return this->myMinutes;
}

void Time::display()
{
    normaliser();
    cout << setw(10) << this->myHours   << " heure(s)"
         << setw (3) << this->myMinutes << " minute(s)" << endl;
}

void Time::normaliser()
{
    this->myHours += (this->myMinutes / 60);
    this->myMinutes = (this->myMinutes % 60);
}

//string Time::getmyTime() const { return this->myTime; }

//void Time::setmyTime(string tps) { this->myTime = tps; }

//void Time::normstr() { string time = ""; for (auto x : this->myTime) { if (x == ' ') { this->myHours += stoull(time);
// time = ""; } else { time = time + x; } } this->myMinutes += (unsigned short) stoul(time);} }
