package Busca_e_Ordenacao;

public class Insert {
	
	public void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
        
            static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
            
    public static int  binarySearch(int arr[], int x)
	{
		int low = 0;
		int high = arr.length-1;
		int mid;

		while(low <= high)
		{
			mid=(low + high) / 2;
                        
                        if(arr[mid] < x)
				low = mid + 1;
                        else if(arr[mid] <= x)
                            return mid;
			else
                            high = mid - 1;
		}
		return -1 ; //NOT_FOUND = -1
	}
    
    public void pesquisarNumero(int x, int numeros[]) {
        int cont = 0;
        
        for(cont = 0; cont < numeros.length; cont++) {
          //Verifica se o elemento que está sendo procurado está no vetor.
          if (numeros[cont] == x) {
            //Se encontrou o elemento, imprime ele na tela e para a pesquisa.
            System.out.println("Encontrou o número " + x);
            break;
          }
        }
        
        //Verifica se não encontrou o elemento no vetor.
        if(cont >= numeros.length)
          System.out.println("Não encontrou o número " + x);
      }


}
