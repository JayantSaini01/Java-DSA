class Solution
{
    TreeNode prev=null;
    boolean res=true;
    public boolean isValidBST(TreeNode root)
    {
        fun( root);
        return res;
    }

    void fun(TreeNode root)
    {
        if(root==null)
        {
            return ;
        }

        fun(root.left);
        {
            if(prev==null)
            {
                prev=root;
            }
            else
            {
                if(root.val<=prev.val)
                {
                    res=false;
                }
                prev =root;
            }
        }
        fun(root.right);
    }
}
