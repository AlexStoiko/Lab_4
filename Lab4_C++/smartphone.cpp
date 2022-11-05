#include "smartphone.h"

Smartphone::Smartphone(string model_sp, int quantity_sp, int price_sp)
{
    this->model_sp = model_sp;
    this->quantity_sp = quantity_sp;
    this->price_sp = price_sp;
}

Smartphone::Smartphone(const Smartphone& smart_ref)
{
    model_sp = string(smart_ref.model_sp);
    quantity_sp = int(smart_ref.quantity_sp);
    price_sp = int(smart_ref.price_sp);
}

Smartphone::Smartphone()
{
    model_sp = "Model";
    quantity_sp = 0;
    price_sp = 0;
}

Smartphone::Smartphone(string model_sp)
{
    this->model_sp = model_sp;
    quantity_sp = 0;
    price_sp = 0;
}

Smartphone::~Smartphone() {}

void Smartphone::input_sp()
{
    cout << "������� ������ ���������" << endl;
    cin >> model_sp;
    cout << "������� ����� ������������� ����������" << endl;
    cin >> quantity_sp;
    cout << "�������� ���� ������ ���������" << endl;
    cin >> price_sp;
}

void Smartphone::output_sp()
{
    cout << "������ ���������: " << model_sp << endl;
    cout << "����� ������������� ��������� = " << quantity_sp << endl;
    cout << "���� ������ ��������� = " << price_sp << endl;
}

string Smartphone::getstr_sp()
{
    string smartphone;
    smartphone = model_sp + " " + to_string(quantity_sp) + " " + to_string(price_sp);
    return smartphone;
}

int Smartphone::income_sp()
{
    return price_sp * quantity_sp;
}

