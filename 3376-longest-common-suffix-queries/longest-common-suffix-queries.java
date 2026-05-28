class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        int idx = -1;
    }

    TrieNode root = new TrieNode();

    // update node with shortest word index
    private void update(TrieNode node, int index, String[] wordsContainer) {
        if (node.idx == -1 ||
            wordsContainer[index].length() < wordsContainer[node.idx].length()) {
            node.idx = index;
        }
    }

    private void insert(String word, int index, String[] wordsContainer) {
        TrieNode node = root;

        update(node, index, wordsContainer);

        for (int i = word.length() - 1; i >= 0; i--) {
            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                node.child[ch] = new TrieNode();
            }

            node = node.child[ch];

            update(node, index, wordsContainer);
        }
    }

    private int search(String word) {
        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {
            int ch = word.charAt(i) - 'a';

            if (node.child[ch] == null) {
                break;
            }

            node = node.child[ch];
        }

        return node.idx;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i, wordsContainer);
        }

        int[] ans = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }
}