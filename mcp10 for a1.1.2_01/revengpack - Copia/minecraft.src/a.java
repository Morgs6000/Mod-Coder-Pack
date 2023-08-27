// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames deadcode fieldsfirst safe 
// Source File Name:   SourceFile

public class a {
    // Declaração de variáveis finais públicas
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    // Outras variáveis
    int e;
    float f;
    float g;
    float h;
    a i;
    public boolean j;

    // Construtor da classe
    public a(int k, int l, int i1) {
        e = -1;
        j = false;
        a = k;
        b = l;
        c = i1;
        d = k | l << 10 | i1 << 20;
    }

    // Método para calcular a distância entre dois objetos da classe 'a'
    public float a(a a1) {
        float f1 = a1.a - a;
        float f2 = a1.b - b;
        float f3 = a1.c - c;
        return eo.c(f1 * f1 + f2 * f2 + f3 * f3);
    }

    // Método para verificar se dois objetos são iguais com base no valor de 'd'
    public boolean equals(java.lang.Object obj) {
        return ((a) obj).d == d;
    }

    // Método para calcular o hashCode com base no valor de 'd'
    public int hashCode() {
        return d;
    }

    // Método para verificar se a variável 'e' é maior ou igual a 0
    public boolean a() {
        return e >= 0;
    }

    // Método para verificar se a variável 'e' é maior ou igual a 0
    public java.lang.String toString() {
        return (new StringBuilder()).append(a).append(", ").append(b).append(", ").append(c).toString();
    }
}
