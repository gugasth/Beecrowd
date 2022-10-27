#include <iostream>
#include <unordered_set>
#include <string>
#include <ctype.h>

using namespace std;
int main() {

    string linha;
    string n;
    unordered_set<char>conjunto;
    getline(cin, n);



    for (int j=0; j<stoi(n); j++) {
        int quantidade_letras = 0;
        conjunto.clear();

        getline(cin, linha);
        if (linha.size() > 1000) return 0;

        for (int i = 0; i < linha.size(); i++) {
            if (isalpha(linha[i])) {
                conjunto.insert(linha[i]);
            }
        }


        for (auto &dado: conjunto) {
            quantidade_letras++;
        }

        if (quantidade_letras == 26) {
            cout << "frase completa" << endl;
        } else if (quantidade_letras >= 13) {
            cout << "frase quase completa" << endl;
        } else {
            cout << "frase mal elaborada" << endl;
        }
    }


    return 0;
}
