#include <iostream>
#include <iomanip>

int main() {
    float tempo, velocidade_media;

    std::cin >> tempo;
    std::cin >> velocidade_media;

    float consumo = (tempo * velocidade_media) / 12;
    std::cout << std::fixed << std::setprecision(3) << consumo << std::endl;

    return 0;
}
