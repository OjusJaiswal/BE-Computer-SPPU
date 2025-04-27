#include <stdio.h>
#include <stdlib.h>
#include "TestJNI.h"

JNIEXPORT jint JNICALL Java_TestJNI_addition (JNIEnv *env, jobject thisObj, jint n1, jint n2)
{
jint res;
res = n1+n2;
return res;
}

JNIEXPORT jint JNICALL Java_TestJNI_subtraction (JNIEnv *env, jobject thisObj, jint n1, jint n2)
{
jint res;
res = n1-n2;
return res;
}

JNIEXPORT jint JNICALL Java_TestJNI_multiplication (JNIEnv *env, jobject thisObj, jint n1, jint n2)
{
jint res;
res = n1*n2;
return res;
}

JNIEXPORT jint JNICALL Java_TestJNI_division (JNIEnv *env, jobject thisObj, jint n1, jint n2)
{
jint res;
if (n2 !=0)
{
res = n1/n2;
return res;
}
else
{
printf("\n Divide by zero error \n\n\n");
exit(0);
}

}
