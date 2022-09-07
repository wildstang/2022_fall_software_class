// WildStang Fall Software Week 1 Assignment 2

// As always, edit this file while in your branch of this folder (repository)

///////////////////////////////////////
// Math and Boolean Logic worksheet
// replace all of the ___'s with the answer

// Section 1 - Integer Math

int a = 2 + 5;
a == _7__;
int b = 45 - 90;
b == _-45_;
int c = 2 * 7;
c == __14_;
int d = 34 % 5; //Modulus (remainder)
d == _4__;
int e = 3 * 0;
e == __0_;
int f = 4 * ((3 + 7) / 2);
f == _20__;


// Section 2 - Assignment Math

int a = 6;
int b = 4;
a = a + b;
b = a - b;
a == _10__;
b == _6__;
int c = 2;
int d = 3;
c = 4 + d;
d = d * 3;
c = 4 + d;
c == _13__;
d == __9_;
int e = 12;
int f = 3;
e = e / f + 1;
f = 3 + f * 2;
e == _5__;
f == _8__;
int g = 10;
int h = 2;
g = g - h / 2 * 6;
h = (3 + 1) * (4 * 2 - 1) - 4 / 2 + 2;
g == __24_;
h == __14_;
int g = 5;
int h = g++;
g == _5__;
h == _6__;
int i = 5;
int j = ++i;
i == _5__;
j == __6_;
int k = 5;
int l = (k++) + 3;
int m = 2 * k + (++l);
l = 2 * (--m) - (k++);
k == _30__;
l == _31__;
m == _19__;

// Section 3 - Boolean Logic

boolean x = 5>4;
x == __true_;
boolean y = 3 < 4 && 5 >= 6;
y == __false_;
boolean z = 5 == 10 / 2 || 7 == 7 * 2;
z == _true__;
boolean u = !(true || false) && !(!true || !false);
u == _false__;
boolean m = ((true && (!false && true)) || !(false && true)) && true;
m == __true_;
boolean n = (true && (!true ^ true)) ^ !(false || (!true));
n == _false__;
