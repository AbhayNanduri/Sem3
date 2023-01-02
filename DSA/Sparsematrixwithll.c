#include<stdio.h>
#include<stdlib.h>

// Node Has (R,C,V) and pointer to the next node
//Struct holds all variables of one type prefect for grouping a node.

struct Node
{
	int v; // value
	int r; // row
	int c; // column
	struct Node *next;
};

// Function to create new node
void create_new_node(struct Node** h, int non_zero_element,
					int m, int n )   // m rows and n columns
{
	struct Node *temp, *r;
	temp = *h;
	if (temp == NULL)
	{
		// Create new node dynamically
		temp = (struct Node *) malloc (sizeof(struct Node));
		temp->v = non_zero_element;
		temp->r = m;
		temp->c = n;
		temp->next = NULL;
		*h = temp;

	}
	else
	{
		while (temp->next != NULL)
			temp = temp->next;

		// Create new node dynamically
		r = (struct Node *) malloc (sizeof(struct Node));
		r->v = non_zero_element;
		r->r = m;
		r->c = n;
		r->next = NULL;
		temp->next = r;

	}
}

// This function prints contents of linked list
// hing from h
void PrintList(struct Node* h)
{
	struct Node *temp, *r, *s;
	temp = r = s = h;

	printf("row: ");
	while(temp != NULL)
	{

		printf("%d ", temp->r);
		temp = temp->next;
	}
	printf("\n");

	printf("column: ");
	while(r != NULL)
	{
		printf("%d ", r->c);
		r = r->next;
	}
	printf("\n");
	printf("value: ");
	while(s != NULL)
	{
		printf("%d ", s->v);
		s = s->next;
	}
	printf("\n");
}


// Driver of the program
int main()
{
// Assume 5x6 sparse matrix
	int sparseMatrix[5][6] =
	{
		{0,0,0,0,9,0},
        {0,8,0,0,0,0},
        {4,0,0,2,0,0},
        {0,0,0,0,0,5},
        {0,0,2,0,0,0}
	};

	/* h with the empty list */
	struct Node* h = NULL;

	for (int i = 0; i < 5; i++)
		for (int j = 0; j < 6; j++)

			// Pass only those vs which are non - zero
			if (sparseMatrix[i][j] != 0)
				create_new_node(&h, sparseMatrix[i][j], i, j);

	PrintList(h);

	return 0;
}