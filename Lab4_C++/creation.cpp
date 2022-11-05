#include "creation.h"

float Creation::taxes = 0;

Creation::Creation(int expenses_rent, int expenses_creation)
{
    this->expenses_rent = expenses_rent;
    this->expenses_creation = expenses_creation;
}

Creation::Creation()
{
    expenses_rent = 0;
    expenses_creation = 0;
}

Creation::Creation(int expenses_rent)
{
    this->expenses_rent = expenses_rent;
    this->expenses_creation = 0;
}

Creation::~Creation() {}

void Creation::set_taxes()
{
    cout << "������� ������ � %" << endl;
    cin >> taxes;
}

float Creation::get_taxes()
{
    return taxes;
}

void Creation::input_creat()
{
    cout << "������� ���������� ��������" << endl;
    cin >> expenses_rent;
    cout << "������� ���������� ��������" << endl;
    cin >> expenses_creation;
}

void Creation::output_creat()
{
    cout << "���������� �������� = " << expenses_rent << endl;
    cout << "���������� �������� = " << expenses_creation << endl;
}

int Creation::expenses_creat()
{
    return expenses_rent + expenses_creation;
}