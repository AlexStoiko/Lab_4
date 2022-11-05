#include "laptop.h"

Laptop::Laptop(string model_lt, int quantity_lt, int price_lt)
{
    this->model_lt = model_lt;
    this->quantity_lt = quantity_lt;
    this->price_lt = price_lt;
}

Laptop::Laptop(const Laptop& lap_ref)
{
    model_lt = string(lap_ref.model_lt);
    quantity_lt = int(lap_ref.quantity_lt);
    price_lt = int(lap_ref.price_lt);
}

Laptop::Laptop()
{
    model_lt = "Model";
    quantity_lt = 0;
    price_lt = 0;
}

Laptop::Laptop(string model_lt)
{
    this->model_lt = model_lt;
    quantity_lt = 0;
    price_lt = 0;
}

Laptop::~Laptop() {}

void Laptop::input_lt()
{
    cout << "������� ������ ��������" << endl;
    cin >> model_lt;
    cout << "������� ����� ������������� ���������" << endl;
    cin >> quantity_lt;
    cout << "������� ���� ������ ��������" << endl;
    cin >> price_lt;
}

void Laptop::output_lt()
{
    cout << "������ ��������: " << model_lt << endl;
    cout << "����� ������������� ��������� = " << quantity_lt << endl;
    cout << "���� ������ �������� = " << price_lt << endl;
}

string Laptop::getstr_lt()
{
    string laptop;
    laptop = model_lt + " " + to_string(quantity_lt) + " " + to_string(price_lt);
    return laptop;
}

int Laptop::income_lt()
{
    return price_lt * quantity_lt;
}