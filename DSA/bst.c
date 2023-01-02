#include<stdio.h>
#include<stdlib.h>

struct node{
    int key;
    struct node *left,*right;
};

struct node* NewNode(int item)
{
    struct node*temp = (struct node*)malloc(sizeof(struct node));
    temp -> key = item;
    temp -> left = temp ->right = NULL;
    return temp;
}

void InOrder(struct node* root)
{
    if (root != NULL)
    {
        InOrder(root ->left);
        printf("\n%d\n", root->key);
        InOrder(root->right);
            }
}

struct node* insert(struct node* node,int key)
{
    if(node == NULL)
        return NewNode(key);
    if(key< node->key)
        node->left=insert(node->left, key);
    if(key>node->key)
        node->right=insert(node->right, key);
    return node;
}

int main()
{
    struct node*root =NULL;
    root=insert(root,50);
         insert(root,30);
         insert(root,20);
         insert(root,80);
         insert(root,70);
         insert(root,60);
    InOrder(root);
    return 0;

}