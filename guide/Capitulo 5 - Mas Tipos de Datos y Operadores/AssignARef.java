/**
 * Asignar variables de referencia en arrays (5-146)
 * AssignARef.java
 */
class AssignARef {
    public static void main(String args[]) {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i=0; i<10; i++)
            nums1[i] = i;
        
        for(i=0; i<10; i++)
            nums2[i] = -i;
        
        System.out.print("Contenido de nums1: ");
        for(i=0; i<10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        System.out.print("Contenido de nums2: ");
        for(i=0; i<10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        nums2 = nums1; //Ahora nums2 refiere a nums1

        System.out.print("Contenido de nums2 luego de la asignacion: ");
        for(i=0; i<10; i++)
            System.out.print(nums2[i] + " ");
        System.out.println();

        //Ahora modificar el array nums1 a traves de nums2
        nums2[3] = 99;

        System.out.print("Contenido de nums1 luego de la alteracion a traves de nums2: ");
        for(i=0; i<10; i++)
            System.out.print(nums1[i] + " ");
        System.out.println();

        
    }

    
}