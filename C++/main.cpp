#include "class/Time.h"

using namespace std;

int main()
{
    string entry("");
    Time Temps(0,0);
    unsigned cpt(0);
    cout << "Entrez temps(heures minutes) : (y pour continuer)" << endl;
    for (cin >> entry; entry != "y" || cin.eof(); cin >> entry)
    {
        if (cpt%2 == 0)
            Temps.addmyHours(stoull(entry));
        else
            Temps.addmyMinutes((short unsigned) stoul(entry));
        ++cpt;
    }
    cout << endl;
    Temps.display();

    return 0;
}
