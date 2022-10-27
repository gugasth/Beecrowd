#include <stdio.h>

int main() {
    float tempo, velocidade_media;

    scanf("%f", &tempo);
    scanf("%f", &velocidade_media);

    float consumo = (tempo * velocidade_media) / 12;

    printf("%0.3f\n",consumo);

    return 0;
}
