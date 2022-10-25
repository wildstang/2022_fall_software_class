// WildStang Fall Software Week 1 Assignment 2

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// Math and Boolean Logic worksheet
// replace all of the ___'s with the answer

// Section 1 - Interger Math

int a = 2 + 5;
a == 7;
int b = 45 - 90;
b == -45;
int c = 2 * 7;
c == 14;
int d = 34 % 5;
d == 1.7;
int e = 3 * 0;
e == 0;
int f = 4 * ((3 + 7) / 2);
f == 20;


// Section 2 - Assignment Math

int a = 6;
int b = 4;
a = a + b;
b = a - b;
a == 10;
b == 6;
int c = 2;
int d = 3;
c = 4 + d;
d = d * 3;
c = 4 + d;
c == 13;
d == 9;
int e = 12;
int f = 3;
e = e / f + 1;
f = 3 + f * 2;
e == 5;
f == 12;
int g = 10;
int h = 2;
g = g - h / 2 * 6;
h = (3 + 1) * (4 * 2 - 1) - 4 / 2 + 2;
g == 4;
h == 28;
int g = 5;
int h = g++;
g == 6;
h == 6;
int i = 5;
int j = ++i;
i == 6;
j == 5;
int k = 5;
int l = (k++) + 3;
int m = 2 * k + (++l);
l = 2 * (--m) - (k++);
k == 7;
l == 36;
m == 20;

// Section 3 - Boolean Logic

boolean x = 5>4;
x == true;
boolean y = 3 < 4 && 5 >= 6;
y == false;
boolean z = 5 == 10 / 2 || 7 == 7 * 2;
z == true;
boolean u = !(true || false) && !(!true || !false);
u == false
boolean m = ((true && (!false && true)) || !(false && true)) && true;
m == true;
boolean n = (true && (!true ^ true)) ^ !(false || (!true));
n == false;
