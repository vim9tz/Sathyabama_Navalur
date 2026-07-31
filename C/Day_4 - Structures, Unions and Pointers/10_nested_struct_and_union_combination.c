#include <stdio.h>
#include <string.h>

typedef enum DataType {
    TYPE_INT,
    TYPE_FLOAT,
    TYPE_STRING
} DataType;

typedef union DataValue {
    int i_val;
    float f_val;
    char s_val[30];
} DataValue;

typedef struct TaggedVariable {
    char name[20];
    DataType type;
    DataValue value;
} TaggedVariable;

void print_tagged_variable(const TaggedVariable *var) {
    printf("Variable '%s' [Type: ", var->name);
    switch (var->type) {
        case TYPE_INT:
            printf("Integer] = %d\n", var->value.i_val);
            break;
        case TYPE_FLOAT:
            printf("Float] = %.2f\n", var->value.f_val);
            break;
        case TYPE_STRING:
            printf("String] = \"%s\"\n", var->value.s_val);
            break;
    }
}

int main(void) {
    TaggedVariable v1;
    strcpy(v1.name, "age");
    v1.type = TYPE_INT;
    v1.value.i_val = 25;

    TaggedVariable v2;
    strcpy(v2.name, "gpa");
    v2.type = TYPE_FLOAT;
    v2.value.f_val = 3.85f;

    TaggedVariable v3;
    strcpy(v3.name, "username");
    v3.type = TYPE_STRING;
    strcpy(v3.value.s_val, "coder_pro");

    printf("--- Tagged Union (Variant Record) Demonstration ---\n");
    print_tagged_variable(&v1);
    print_tagged_variable(&v2);
    print_tagged_variable(&v3);

    printf("\nMemory layout of TaggedVariable: %zu bytes (struct size optimized via union)\n", sizeof(TaggedVariable));

    return 0;
}
