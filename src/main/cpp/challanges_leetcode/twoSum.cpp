#include <iostream>

int main(int argc, char const *argv[])
{
    int alvo = 10;
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 18, 20, 21, 34, 1, 34, 5, 10992, 12};

    int head = 0;
    int tail = sizeof(array) / sizeof(array[0]) - 1;

    while (tail > head)
    {
        int soma = array[head] + array[tail];

        if (soma == alvo)
        {
            std::cout << "Alvo encontrado: " << array[head]
                      << " + " << array[tail] << " = " << alvo << std::endl;

            return 0;
        }
        else if (soma < alvo)
        {
            head++;
        }
        else
        {
            tail--;
        }
    }

    std::cout << "Nenhum par encontrado" << std::endl;

    return 0;
}
