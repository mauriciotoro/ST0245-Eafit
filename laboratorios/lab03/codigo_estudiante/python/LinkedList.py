class LinkedList:
    """
    Implementation of a simple
    LinkedList.

    @Author: AlejandroMllo
    """

    class Node:
        """
        Implementation of the
        LinkedList's node.
        """

        def __init__(self, data):
            """
            Creates a new Node.
            :param data: The node's data.
            """



    def __init__(self):
        """
        Creates a new LinkedList.
        Initializes the Head and Tail node
        to None; and its size to 0.
        """


    def add_at_start(self, data):
        """
        Adds an element at the start of the
        LinkedList.

        :param data: The new Node data.
        :return: Void
        """


    def add(self, data):
        """
        Adds an element to the end of
        the list.

        :param data: The new Node data.
        :return: Void
        """



    def delete_end(self):
        """
        Deletes the last element on the
        LinkedList.

        :return: Void
        """



    def delete_start(self):
        """
        Deletes the first element
        on the LinkedList.

        :return: Void
        """

    def delete(self, i):
        """
        Deletes the element at position i.

        :param i: Element's index
        :return: Void
        """
   

    def get(self, i):
        """
        Returns the ith linked element.

        :param index:
        :return: Node
        """

    
    def print_reversed(self):
        """
        Prints the list in reverse order.

        :return: Void
        """
      

    def __str__(self):

        if self.head == None:
            return "[]"
        current = self.head
        s = "[" + str(current.data)
        while current.next != None:
            current = current.next
            s += ", " + str(current.data)

        return s + "]"

    def __contains__(self, item):

       
    def __len__(self):
        return self.size

# --- Unit Tests
import unittest

class LinkedList_UnitTests(unittest.TestCase):

    linked_list = LinkedList()

    # Deletion

    def test_empty_linked_list(self):

        linked_list_1 = LinkedList()

        self.assertEqual(str(linked_list_1), "[]")

        linked_list_1.delete_end()
        self.assertEqual(str(linked_list_1), "[]")

        linked_list_1.add(5)

        self.assertEqual(str(linked_list_1), "[5]")

    def test_non_empty_linked_list(self):

        linked_list_1 = LinkedList()

        linked_list_1.add(6)
        linked_list_1.add_at_start(1)

        self.assertEqual(str(linked_list_1), "[1, 6]")

        linked_list_1.delete_end()

        self.assertEqual(str(linked_list_1), "[1]")

        linked_list_1.add_at_start(10)
        linked_list_1.delete_start()

        self.assertEqual(str(linked_list_1), "[1]")

        linked_list_1.add(15)
        linked_list_1.delete(0)

        self.assertEqual(str(linked_list_1), "[15]")

    # Insertion

    def test_insertion(self):

        linked_list_1 = LinkedList()

        linked_list_1.add_at_start(100)

        self.assertEqual(str(linked_list_1), "[100]")

        linked_list_1.add_at_start(200)
        linked_list_1.delete_end()

        self.assertEqual(str(linked_list_1), "[200]")

        linked_list_1.add(300)
        linked_list_1.add(500)
        linked_list_1.add_at_start(-100)

        self.assertEqual(str(linked_list_1), "[-100, 200, 300, 500]")

suite = unittest.TestLoader().loadTestsFromTestCase(LinkedList_UnitTests)
unittest.TextTestRunner(verbosity=2).run(suite)
