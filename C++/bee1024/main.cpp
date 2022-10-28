#include <iostream>
#include <string>
#include <ctype.h> // http://linguagemc.com.br/ctype-h-toupper-tolower-isalpha-isdigit-em-c/
#include <stack>

using namespace std;

// caracteres que sejam letras minusculas e maiusculas,
// devem ser deslocados 3 casas a direita
void primeira_passada(string & algo) {
    // percorre a string
    for (int i = 0; i < algo.size(); i++) {
        // Se o caractere for maiusculo ou minusculo
        if (isupper(algo[i]) || islower(algo[i])) {
            // Então desloca 3 casas para a direita.
            algo[i] += 3;
        }
    }
}

void segunda_passada(string & algo){
    stack<char>letras;

    // empilha todas as letras da palavra
    for (int i=0; i<algo.size(); i++){
        letras.push(algo[i]);
    }

    int j=0;
    // desempilha; assim, invertendo a palavra
    while (!letras.empty()){
        algo[j] = letras.top();
        letras.pop();
        j++;
    }
}

void terceira_passada(string & algo){
    for (int i=algo.size()/2; i<algo.size(); i++){
        algo[i]--;
    }
}



int main() {
    string n;
    // armazena o inteiro que define a quantidade de palavras que o usuário vai inserir
    getline(cin,n);



    for (int i=0; i<stoi(n); i++) {
        string palavra;
        getline (cin, palavra);

        primeira_passada(palavra);
        segunda_passada(palavra);
        terceira_passada(palavra);

        cout << palavra << endl;
    }
    return 0;
}
